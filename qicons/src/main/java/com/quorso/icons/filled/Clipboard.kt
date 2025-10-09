package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Clipboard: ImageVector
    get() {
        if (_Clipboard != null) {
            return _Clipboard!!
        }
        _Clipboard = ImageVector.Builder(
            name = "Filled.Clipboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.5f, 3f)
                arcTo(1.501f, 1.501f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 4.5f)
                horizontalLineToRelative(6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(7.807f, 3.178f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.694f, 1.678f)
                curveToRelative(0.497f, 0.042f, 0.992f, 0.092f, 1.486f, 0.15f)
                curveToRelative(1.497f, 0.173f, 2.57f, 1.46f, 2.57f, 2.929f)
                lineTo(20.25f, 19.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(6.75f, 22.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(3.75f, 6.257f)
                curveToRelative(0f, -1.47f, 1.073f, -2.756f, 2.57f, -2.93f)
                curveToRelative(0.493f, -0.057f, 0.989f, -0.107f, 1.487f, -0.15f)
                close()
            }
        }.build()

        return _Clipboard!!
    }

@Suppress("ObjectPropertyName")
private var _Clipboard: ImageVector? = null
