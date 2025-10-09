package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Rss: ImageVector
    get() {
        if (_Rss != null) {
            return _Rss!!
        }
        _Rss = ImageVector.Builder(
            name = "Outlined.Rss",
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
                moveTo(12.75f, 19.5f)
                verticalLineToRelative(-0.75f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.5f, -7.5f)
                horizontalLineTo(4.5f)
                moveToRelative(0f, -6.75f)
                horizontalLineToRelative(0.75f)
                curveToRelative(7.87f, 0f, 14.25f, 6.38f, 14.25f, 14.25f)
                verticalLineToRelative(0.75f)
                moveTo(6f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                close()
            }
        }.build()

        return _Rss!!
    }

@Suppress("ObjectPropertyName")
private var _Rss: ImageVector? = null
