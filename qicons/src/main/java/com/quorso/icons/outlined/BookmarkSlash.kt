package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.BookmarkSlash: ImageVector
    get() {
        if (_BookmarkSlash != null) {
            return _BookmarkSlash!!
        }
        _BookmarkSlash = ImageVector.Builder(
            name = "Outlined.BookmarkSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(3f, 3f)
                lineToRelative(1.664f, 1.664f)
                moveTo(21f, 21f)
                lineToRelative(-1.5f, -1.5f)
                moveToRelative(-5.485f, -1.242f)
                lineTo(12f, 17.25f)
                lineTo(4.5f, 21f)
                verticalLineTo(8.742f)
                moveToRelative(0.164f, -4.078f)
                arcToRelative(2.15f, 2.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.743f, -1.342f)
                arcToRelative(48.507f, 48.507f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.186f, 0f)
                curveToRelative(1.1f, 0.128f, 1.907f, 1.077f, 1.907f, 2.185f)
                verticalLineTo(19.5f)
                moveTo(4.664f, 4.664f)
                lineTo(19.5f, 19.5f)
            }
        }.build()

        return _BookmarkSlash!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkSlash: ImageVector? = null
