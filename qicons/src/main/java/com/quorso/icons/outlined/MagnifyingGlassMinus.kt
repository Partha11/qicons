package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.MagnifyingGlassMinus: ImageVector
    get() {
        if (_MagnifyingGlassMinus != null) {
            return _MagnifyingGlassMinus!!
        }
        _MagnifyingGlassMinus = ImageVector.Builder(
            name = "Outlined.MagnifyingGlassMinus",
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
                moveToRelative(21f, 21f)
                lineToRelative(-5.197f, -5.197f)
                moveToRelative(0f, 0f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.196f, 5.196f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.607f, 10.607f)
                close()
                moveTo(13.5f, 10.5f)
                horizontalLineToRelative(-6f)
            }
        }.build()

        return _MagnifyingGlassMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassMinus: ImageVector? = null
