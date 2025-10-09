package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CpuChip: ImageVector
    get() {
        if (_CpuChip != null) {
            return _CpuChip!!
        }
        _CpuChip = ImageVector.Builder(
            name = "Outlined.CpuChip",
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
                moveTo(8.25f, 3f)
                verticalLineToRelative(1.5f)
                moveTo(4.5f, 8.25f)
                lineTo(3f, 8.25f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-1.5f)
                moveTo(4.5f, 12f)
                lineTo(3f, 12f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(-15f, 3.75f)
                lineTo(3f, 15.75f)
                moveToRelative(18f, 0f)
                horizontalLineToRelative(-1.5f)
                moveTo(8.25f, 19.5f)
                lineTo(8.25f, 21f)
                moveTo(12f, 3f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 15f)
                lineTo(12f, 21f)
                moveToRelative(3.75f, -18f)
                verticalLineToRelative(1.5f)
                moveToRelative(0f, 15f)
                lineTo(15.75f, 21f)
                moveToRelative(-9f, -1.5f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                lineTo(19.5f, 6.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                lineTo(6.75f, 4.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 6.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                close()
                moveTo(7.5f, 7.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-9f)
                close()
            }
        }.build()

        return _CpuChip!!
    }

@Suppress("ObjectPropertyName")
private var _CpuChip: ImageVector? = null
