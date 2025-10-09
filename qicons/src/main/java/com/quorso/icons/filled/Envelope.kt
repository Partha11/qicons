package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Envelope: ImageVector
    get() {
        if (_Envelope != null) {
            return _Envelope!!
        }
        _Envelope = ImageVector.Builder(
            name = "Filled.Envelope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 8.67f)
                verticalLineToRelative(8.58f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineTo(8.67f)
                lineToRelative(-8.928f, 5.493f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.144f, 0f)
                lineTo(1.5f, 8.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 6.908f)
                verticalLineTo(6.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(0.158f)
                lineToRelative(9.714f, 5.978f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.572f, 0f)
                lineTo(22.5f, 6.908f)
                close()
            }
        }.build()

        return _Envelope!!
    }

@Suppress("ObjectPropertyName")
private var _Envelope: ImageVector? = null
